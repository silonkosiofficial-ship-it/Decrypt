.class LJ1/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ1/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Landroid/graphics/Rect;)V
    .locals 0

    check-cast p1, LC1/B;

    invoke-virtual {p0, p1, p2}, LJ1/a$a;->b(LC1/B;Landroid/graphics/Rect;)V

    return-void
.end method

.method public b(LC1/B;Landroid/graphics/Rect;)V
    .locals 0

    invoke-virtual {p1, p2}, LC1/B;->m(Landroid/graphics/Rect;)V

    return-void
.end method
