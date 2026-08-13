.class public final LU7/g;
.super LU7/f;
.source "SourceFile"

# interfaces
.implements Le8/c;


# instance fields
.field private final c:Ljava/lang/annotation/Annotation;


# direct methods
.method public constructor <init>(Ln8/f;Ljava/lang/annotation/Annotation;)V
    .locals 1

    const-string v0, "annotation"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LU7/f;-><init>(Ln8/f;Ly7/k;)V

    iput-object p2, p0, LU7/g;->c:Ljava/lang/annotation/Annotation;

    return-void
.end method


# virtual methods
.method public a()Le8/a;
    .locals 2

    new-instance v0, LU7/e;

    iget-object v1, p0, LU7/g;->c:Ljava/lang/annotation/Annotation;

    invoke-direct {v0, v1}, LU7/e;-><init>(Ljava/lang/annotation/Annotation;)V

    return-object v0
.end method
