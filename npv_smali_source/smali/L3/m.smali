.class final LL3/m;
.super LL3/n;
.source "SourceFile"


# direct methods
.method constructor <init>(LO3/f;)V
    .locals 0

    invoke-direct {p0, p1}, LL3/n;-><init>(LO3/f;)V

    return-void
.end method


# virtual methods
.method protected final bridge synthetic c(Lcom/google/android/gms/common/api/Status;)LO3/k;
    .locals 0

    return-object p1
.end method

.method protected final bridge synthetic l(LO3/a$b;)V
    .locals 2

    check-cast p1, LL3/i;

    invoke-virtual {p1}, LQ3/c;->D()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, LL3/u;

    new-instance v1, LL3/l;

    invoke-direct {v1, p0}, LL3/l;-><init>(LL3/m;)V

    invoke-virtual {p1}, LL3/i;->m0()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, LL3/u;->L0(LL3/t;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    return-void
.end method
