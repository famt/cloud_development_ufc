import boto3

# Get the service resource.
dynamodb = boto3.resource('dynamodb')

# Instantiate a table resource object without actually
# creating a DynamoDB table. Note that the attributes of this table
# are lazy-loaded: a request is not made nor are the attribute
# values populated until the attributes
# on the table resource are accessed or its load() method is called.
table = dynamodb.Table('users')

table.put_item(
   Item={
        'username': 'janedoe',
        'first_name': 'Jane',
        'last_name': 'Doe1',
        'age': 25,
        'account_type': 'standard_user',
    }
)

table.put_item(
   Item={
        'username': 'janedoe',
        'first_name': 'Jane',
        'last_name': 'Doe2',
        'age': 26,
        'account_type': 'standard_user',
    }
)

table.put_item(
   Item={
        'username': 'janedoe',
        'first_name': 'Jane',
        'last_name': 'Doe3',
        'age': 27,
        'account_type': 'standard_user',
    }
)


table.put_item(
   Item={
        'username': 'johndoe',
        'first_name': 'John',
        'last_name': 'Doe',
        'age': 30,
        'account_type': 'standard_user',
    }
)


table.put_item(
   Item={
        'username': 'johndoe',
        'first_name': 'John',
        'last_name': 'Doe',
        'age': 35,
        'account_type': 'standard_user',
    }
)
