.class public final LT7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO7/a0;


# instance fields
.field private final b:Ljava/lang/annotation/Annotation;


# direct methods
.method public constructor <init>(Ljava/lang/annotation/Annotation;)V
    .locals 1

    const-string v0, "annotation"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT7/b;->b:Ljava/lang/annotation/Annotation;

    return-void
.end method


# virtual methods
.method public a()LO7/b0;
    .locals 2

    sget-object v0, LO7/b0;->a:LO7/b0;

    const-string v1, "NO_SOURCE_FILE"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final d()Ljava/lang/annotation/Annotation;
    .locals 1

    iget-object v0, p0, LT7/b;->b:Ljava/lang/annotation/Annotation;

    return-object v0
.end method
