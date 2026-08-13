.class public abstract Lr8/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LO7/F;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LO7/F;

    const-string v1, "StdlibClassFinder"

    invoke-direct {v0, v1}, LO7/F;-><init>(Ljava/lang/String;)V

    sput-object v0, Lr8/r;->a:LO7/F;

    return-void
.end method

.method public static final a(LO7/G;)Lr8/q;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lr8/r;->a:LO7/F;

    invoke-interface {p0, v0}, LO7/G;->q0(LO7/F;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lr8/q;

    if-nez p0, :cond_0

    sget-object p0, Lr8/b;->a:Lr8/b;

    :cond_0
    return-object p0
.end method
