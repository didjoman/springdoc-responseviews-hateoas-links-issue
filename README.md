# springdoc-responseviews-hateoas-links-issue

The Open Api Specification generated (schema for Link_Animal is missing):
```json
{
  "openapi": "3.1.0",
  "info": {
    "title": "OpenAPI definition",
    "version": "v0"
  },
  "servers": [
    {
      "url": "http://localhost:8080",
      "description": "Generated server url"
    }
  ],
  "paths": {
    "/cat": {
      "get": {
        "tags": [
          "basic-controller"
        ],
        "summary": "get",
        "description": "Provides an animal.",
        "operationId": "get",
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "$ref": "#/components/schemas/Cat_Animal"
                }
              }
            }
          }
        }
      }
    }
  },
  "components": {
    "schemas": {
      "Cat_Animal": {
        "type": "object",
        "description": "Represents a Cat class.",
        "properties": {
          "speed": {
            "type": "integer",
            "format": "int32"
          },
          "_links": {
            "type": "array",
            "$ref": "#/components/schemas/Links",
            "items": {
              "$ref": "#/components/schemas/Link_Animal"
            }
          }
        }
      },
      "Link": {
        "type": "object",
        "properties": {
          "href": {
            "type": "string"
          },
          "hreflang": {
            "type": "string"
          },
          "title": {
            "type": "string"
          },
          "type": {
            "type": "string"
          },
          "deprecation": {
            "type": "string"
          },
          "profile": {
            "type": "string"
          },
          "name": {
            "type": "string"
          },
          "templated": {
            "type": "boolean"
          }
        }
      },
      "Links": {
        "type": "object",
        "additionalProperties": {
          "type": "object",
          "$ref": "#/components/schemas/Link"
        }
      }
    }
  }
}
```
