import com.github.pambrose.common.util.FileSystemSource
import com.github.pambrose.common.util.GitHubRepo
import com.github.pambrose.common.util.OwnerType
import com.github.readingbat.dsl.ReturnType.BooleanType
import com.github.readingbat.dsl.ReturnType.StringType
import com.github.readingbat.dsl.isProduction
import com.github.readingbat.dsl.readingBatContent

val content =
  readingBatContent {
    repo = if (isProduction()) GitHubRepo(OwnerType.User, "maleich", "ReadingBat-content") else FileSystemSource("./")

    python {

      group("Booleans") {
        packageName = "boolean"
        description = "Basic boolean expressions"

        challenge("boolean1") {
          description = "Descriptions support **markdown**"
          returnType = BooleanType
        }

        challenge("greater_than2") {
          returnType = BooleanType
        }
        includeFilesWithType = "greater_than*.py" returns BooleanType
        includeFilesWithType = "less_than*.py" returns BooleanType
        includeFilesWithType = "is_equal*.py" returns BooleanType
        includeFilesWithType = "not_equal*.py" returns BooleanType
      }

      group("Strings") {
          packageName = "strings"
          description = "Practicing string operations"
          includeFilesWithType = "strings*.py" returns StringType
      }

      group("Grab Bag") {
        packageName = "grab_bag"
        description = "Miscellaneous practice"
        includeFilesWithType = "slice*.py" returns StringType
      }
   
      group("Variable Types") {
        packageName = "variable_type"
        description = "Identify basic variable types."
        includeFilesWithType = "variable_type*.py" returns StringType
      }
    }
  }
   
