.class public Landroidx/core/graphics/i$a;
.super Ly1/h$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/graphics/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Landroidx/core/content/res/h$e;


# direct methods
.method public constructor <init>(Landroidx/core/content/res/h$e;)V
    .locals 0

    invoke-direct {p0}, Ly1/h$c;-><init>()V

    iput-object p1, p0, Landroidx/core/graphics/i$a;->a:Landroidx/core/content/res/h$e;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/core/graphics/i$a;->a:Landroidx/core/content/res/h$e;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/core/content/res/h$e;->h(I)V

    :cond_0
    return-void
.end method

.method public b(Landroid/graphics/Typeface;)V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/core/graphics/i$a;->a:Landroidx/core/content/res/h$e;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/core/content/res/h$e;->i(Landroid/graphics/Typeface;)V

    :cond_0
    return-void
.end method
