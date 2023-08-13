public enum Currency {
        USD(1.0),
        EUR(0.85),
        GBP(0.76),
        INR(75.0);

        private double exchangeRateToUSD;

        Currency(double exchangeRateToUSD) {
            this.exchangeRateToUSD = exchangeRateToUSD;
        }

        public double getExchangeRateToUSD() {
            return exchangeRateToUSD;
        }

}
