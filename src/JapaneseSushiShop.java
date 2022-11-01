public class JapaneseSushiShop extends SushiShop {

        @Override
        public Sushi createSushi (SushiType type) {
            Sushi sushi = null;

            switch (type) {
                case NIGIRI:
                    sushi = new JapaneseNigiri();
                    break;

                case MAKI:
                    sushi = new JapaneseMaki();
                    break;

                case URAMAKI:
                    sushi = new JapaneseUramaki();
                    break;

                case SASHIMI:
                    sushi = new JapaneseSashimi();
                    break;

                case TEMAKI:
                    sushi = new JapaneseTemaki();
                    break;
            }
            return sushi;
        }
}