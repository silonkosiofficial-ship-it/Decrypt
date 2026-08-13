.class public abstract LE4/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(LE4/m;FFF)V
.end method

.method public b(LE4/m;FFLandroid/graphics/RectF;LE4/c;)V
    .locals 0

    invoke-interface {p5, p4}, LE4/c;->a(Landroid/graphics/RectF;)F

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, LE4/d;->a(LE4/m;FFF)V

    return-void
.end method
