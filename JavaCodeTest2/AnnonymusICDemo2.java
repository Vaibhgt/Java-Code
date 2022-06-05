class AnnonymusICDemo2{
	public static void main(String[] args){
		Thread t1=new Thread(){
			public void run(){
			int sum=0;
			for(int i=0;i<=9;i++){
				sum=sum+i;
			}
			System.out.println("sum ="+sum);
			
		}
		};
		
		Thread t2=new Thread(){
				public void run(){
					int multi=1;
					for(int i=1;i<=10;i++){
						multi=multi*i;
					}
					System.out.println("multi ="+multi);
					
		}
				
		};
			
			
			
		
		t1.start();
		t2.start();
		
		
	}
	
	
	
	
	
}