import com.github.pambrose.common.util.FileSystemSource
import com.github.pambrose.common.util.GitHubRepo
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
        
        challenge("greater_than2"){
            returnType = BooleanType
        }
        includeFilesWithType = "greater_than*.py" returns BooleanType
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

    java {

      group("Group A") {
        packageName = "group a"
        description = "A description"

        challenge("JoinEnds") {
          description = "This description supports **markdown**"
        }
      }

      group("Group 2") {
        packageName = "group2"
        description = "A description"
        includeFiles = "Has*.java"
      }

    }

    kotlin {

      group("Group1 1") {
        packageName = "kgroup1"
        description = "This is a description of Group 1"

        challenge("StringLambda1") {
          description = "This is a description of StringLambda1"
          returnType = StringType
        }
      }

      group("Group 2") {
        packageName = "kgroup2"
        includeFilesWithType = "lambda*.kt" returns StringType
      }
    }
  }
