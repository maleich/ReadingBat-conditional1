import com.github.pambrose.common.util.FileSystemSource
import com.github.pambrose.common.util.GitHubRepo
import com.github.pambrose.common.util.OwnerType
import com.github.readingbat.dsl.ReturnType.*
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

        challenge("parameters1") {
          returnType = IntType
        }
      }

      group("Loops") {
        packageName = "loops"
        description = "While and for loop practice"
        includeFilesWithType = "while*.py" returns IntType

      }

      group("Variables") {
        packageName = "variables"
        description = "Variables & mathematical operations"

        challenge("addition1") {
          //description = *in exercise*
          returnType = IntType
        }
        challenge("addition2") {
          //description = *in exercise*
          returnType = IntType  //this wants to be FloatType
        }
        challenge("addition3") {
          //description = *in exercise*
          returnType = IntType
        }
        challenge("addition4") {
          returnType = StringType
        }
        challenge("subtract1") {
          returnType = IntType
        }
        challenge("subtract2") {
          returnType = IntType  // This wants to be FloatType
        }
        challenge("subtract3") {
          returnType = IntType
        }
        challenge("mult1") {
          returnType = IntType
        }
        challenge("mult2") {
          returnType = StringType
        }
        challenge("divide1") {
          returnType = IntType  // This should be a float
        }
        challenge("mod1") {
          returnType = IntType
        }
        challenge("exponent1") {
          returnType = IntType
        }
        challenge("floor_division1") {
          returnType = IntType
        }
        includeFilesWithType = "variable_type*.py" returns StringType
      }

    }
  }

   
