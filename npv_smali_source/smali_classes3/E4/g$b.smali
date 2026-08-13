.class LE4/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE4/k$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE4/g;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:LE4/g;


# direct methods
.method constructor <init>(LE4/g;F)V
    .locals 0

    iput-object p1, p0, LE4/g$b;->b:LE4/g;

    iput p2, p0, LE4/g$b;->a:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LE4/c;)LE4/c;
    .locals 2

    .prologue
    instance-of v0, p1, LE4/i;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LE4/b;

    iget v1, p0, LE4/g$b;->a:F

    invoke-direct {v0, v1, p1}, LE4/b;-><init>(FLE4/c;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method
