package edu.knoldus;


class Application {

        public static void main(String[] args) {

            Twitter twitter = new Twitter("#Scala");
            twitter.noOfTweets();
            twitter.averageTweetsPerDay();
            twitter.averageLikes();
            twitter.averageReTweets();
            try {
                Thread.sleep(30000);
            }catch (InterruptedException e)
            {
                e.getMessage();
            }

        }
    }


