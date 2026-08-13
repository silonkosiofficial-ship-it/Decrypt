.class public abstract LM4/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LM4/g;
    .locals 1

    invoke-static {}, LM4/a;->e()LM4/g;

    move-result-object v0

    return-object v0
.end method

.method public static d(Ljava/lang/Object;)LM4/g;
    .locals 1

    new-instance v0, LM4/i;

    invoke-static {p0}, LM4/h;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-direct {v0, p0}, LM4/i;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public abstract b()Ljava/lang/Object;
.end method

.method public abstract c()Z
.end method
