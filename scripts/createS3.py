import boto3

# Let's use Amazon S3
s3 = boto3.client('s3')
s3.create_bucket(Bucket='my-bucket-auladesexta',CreateBucketConfiguration={'LocationConstraint': 'sa-east-1'})

