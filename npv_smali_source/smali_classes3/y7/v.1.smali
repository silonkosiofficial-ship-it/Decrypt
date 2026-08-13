.class public abstract Ly7/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly7/o;
.implements Ljava/io/Serializable;


# instance fields
.field private final C:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ly7/v;->C:I

    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    iget v0, p0, Ly7/v;->C:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    invoke-static {p0}, Ly7/P;->m(Ly7/v;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "renderLambdaToString(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
