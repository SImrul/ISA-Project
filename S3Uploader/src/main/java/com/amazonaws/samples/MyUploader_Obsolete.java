package com.amazonaws.samples;
//package com.amazonaws.samples;
//
//import java.io.File;
//
//import com.amazonaws.AmazonClientException;
//import com.amazonaws.regions.Region;
//import com.amazonaws.regions.Regions;
//import com.amazonaws.services.s3.AmazonS3;
//import com.amazonaws.services.s3.AmazonS3Client;
//import com.amazonaws.services.s3.model.Bucket;
//import com.amazonaws.services.s3.model.PutObjectRequest;
//
//public class MyUploader {
//
//	public static void main(String[] args) throws AmazonClientException{
//		
//		String va = paramValidator(args); 
//		if( va != null) { // Invalid parameters
//			System.out.println(va); 
//			System.exit(0);
//		}
//		
//		AmazonS3 s3 = new AmazonS3Client();
//		Region s3Region = Region.getRegion(Regions.DEFAULT_REGION);
//		s3.setRegion(s3Region);
//		
//		final String key = args[0];
//		final String filename = args[1];
//		String bucketName = "imrul.auto.audit-logs";
//		if(args.length > 2) bucketName = args[2]; 
////		final String key = "edu.umkc.cs573.imrul.audit.log";// + System.currentTimeMillis();
//		Bucket putBucket = null;
//		for (Bucket b : s3.listBuckets()) {
//			if (b.getName().equals(bucketName))
//				putBucket = b;
//		}
//		try {
//			if (putBucket == null) {
//				s3.createBucket(bucketName);
//				System.out.println("Bucket didn't existed, new bucket created.");
//			}
//		} catch (AmazonClientException ce) {
//			System.out.println(ce.getMessage());
//		}
//		System.out.println("Uploading a new object to S3 from a file.");
//        s3.putObject(new PutObjectRequest(bucketName, key, new File(filename)));
//        System.out.println("Uploaded successfully.");
//	}
//	
//	private static String paramValidator(String[] args) {
//		if(args == null || args.length < 2) { 
//			return "Usage:\nMyUploader [key] [file name] [bucket name]\n" +
//					"Bucket name is optional.\n" +
//					"Warning: If key already exists the previous file will be overwritten.\n" +
//					"Key value should be lowercase letters.\n";
//		}
//		File t = new File(args[1]);
//		if(!t.canRead()) 
//			return "The file specified does not exists or can not be read.";
//		
//		return null;
//	}
//}
