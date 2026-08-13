.class public abstract LM1/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/String;)LM1/n;
    .locals 1

    const-string v0, "filePath"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LM1/u;

    invoke-direct {v0, p0}, LM1/u;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
