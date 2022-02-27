package programmersCoTe.newId;

class NewId {

    public String solution(String new_id) {

        String answer = new KAKAOID(new_id)
                .replaceToLowerCase()
                .filter()
                .toSingleDot()
                .noStartEndDot()
                .noBlank()
                .noGreaterThan16()
                .noLessThan2()
                .getResult();

        return answer;
    }

    private static class KAKAOID {
        private String s;

        public KAKAOID(String s) {
            this.s = s;
        }

        private KAKAOID replaceToLowerCase() {
            s = s.toLowerCase();
            return this;
        }

        private KAKAOID filter() {
            //regex : a-z, 0-9, ., -, _ 를 제외한 문자 1개
            s = s.replaceAll("[^a-z0-9._-]", "");
            return this;
        }

        private KAKAOID toSingleDot() {
            //regex : . 문자가 2회 이상 반복되는 경우
            s = s.replaceAll("[.]{2,}",".");
            return this;
        }

        private KAKAOID noStartEndDot() {
            //regex : .으로 시작하거나 .로 끝나는 경우
            s = s.replaceAll("^[.]|[.]$", "");
            return this;
        }
        private KAKAOID noBlank() {
            s = s.isEmpty() ? "a" : s;
            return this;
        }

        private KAKAOID noGreaterThan16() {
            if (s.length() >= 16) {
                s = s.substring(0, 15);
            }
            s = s.replaceAll("[.]$", "");
            return this;
        }

        private KAKAOID noLessThan2() {
            StringBuilder sBuilder = new StringBuilder(s);
            while (sBuilder.length() <= 2) {
                sBuilder.append(sBuilder.charAt(sBuilder.length() - 1));
            }
            s = sBuilder.toString();
            return this;
        }

        private String getResult() {
            return s;
        }
    }
}
