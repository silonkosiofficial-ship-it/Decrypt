.class public abstract LX2/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/List;)LX2/n;
    .locals 1

    new-instance v0, LX2/d;

    invoke-direct {v0, p0}, LX2/d;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static b()Lz5/a;
    .locals 2

    new-instance v0, LB5/d;

    invoke-direct {v0}, LB5/d;-><init>()V

    sget-object v1, LX2/b;->a:LA5/a;

    invoke-virtual {v0, v1}, LB5/d;->j(LA5/a;)LB5/d;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LB5/d;->k(Z)LB5/d;

    move-result-object v0

    invoke-virtual {v0}, LB5/d;->i()Lz5/a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract c()Ljava/util/List;
.end method
