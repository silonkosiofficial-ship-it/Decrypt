.class public Lh5/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LF5/a;


# direct methods
.method public constructor <init>(LF5/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh5/l;->a:LF5/a;

    return-void
.end method

.method public static synthetic a(Lh5/e;LF5/b;)V
    .locals 0

    invoke-static {p0, p1}, Lh5/l;->b(Lh5/e;LF5/b;)V

    return-void
.end method

.method private static synthetic b(Lh5/e;LF5/b;)V
    .locals 1

    invoke-interface {p1}, LF5/b;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LP5/a;

    const-string v0, "firebase"

    invoke-interface {p1, v0, p0}, LP5/a;->a(Ljava/lang/String;LQ5/f;)V

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p0

    const-string p1, "Registering RemoteConfig Rollouts subscriber"

    invoke-virtual {p0, p1}, Lh5/g;->b(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public c(Lm5/n;)V
    .locals 2

    .prologue
    if-nez p1, :cond_0

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p1

    const-string v0, "Didn\'t successfully register with UserMetadata for rollouts listener"

    invoke-virtual {p1, v0}, Lh5/g;->k(Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v0, Lh5/e;

    invoke-direct {v0, p1}, Lh5/e;-><init>(Lm5/n;)V

    iget-object p1, p0, Lh5/l;->a:LF5/a;

    new-instance v1, Lh5/k;

    invoke-direct {v1, v0}, Lh5/k;-><init>(Lh5/e;)V

    invoke-interface {p1, v1}, LF5/a;->a(LF5/a$a;)V

    return-void
.end method
