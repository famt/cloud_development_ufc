import boto3

# Let's use Amazon S3
s3 = boto3.client('s3')


filename = 'uploadS3.py'
bucket_name = 'my-bucket-auladesexta'

# Uploads the given file using a managed uploader, which will split up large
# files automatically and upload parts in parallel.
resp = s3.upload_file(filename, bucket_name, filename)
print(resp)
