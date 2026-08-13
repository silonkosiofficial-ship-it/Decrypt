.class final LI3/e;
.super LO3/a$a;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, LO3/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Landroid/content/Context;Landroid/os/Looper;LQ3/d;Ljava/lang/Object;LO3/f$a;LO3/f$b;)LO3/a$f;
    .locals 7

    move-object v4, p4

    check-cast v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    new-instance p4, LL3/i;

    move-object v0, p4

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, LL3/i;-><init>(Landroid/content/Context;Landroid/os/Looper;LQ3/d;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;LO3/f$a;LO3/f$b;)V

    return-object p4
.end method
