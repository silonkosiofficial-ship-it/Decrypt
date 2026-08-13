.class public abstract Landroidx/databinding/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Landroidx/databinding/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/databinding/DataBinderMapperImpl;

    invoke-direct {v0}, Landroidx/databinding/DataBinderMapperImpl;-><init>()V

    sput-object v0, Landroidx/databinding/f;->a:Landroidx/databinding/d;

    return-void
.end method

.method static a(Landroidx/databinding/e;Landroid/view/View;I)Landroidx/databinding/g;
    .locals 1

    sget-object v0, Landroidx/databinding/f;->a:Landroidx/databinding/d;

    invoke-virtual {v0, p0, p1, p2}, Landroidx/databinding/d;->b(Landroidx/databinding/e;Landroid/view/View;I)Landroidx/databinding/g;

    move-result-object p0

    return-object p0
.end method

.method static b(Landroidx/databinding/e;[Landroid/view/View;I)Landroidx/databinding/g;
    .locals 1

    sget-object v0, Landroidx/databinding/f;->a:Landroidx/databinding/d;

    invoke-virtual {v0, p0, p1, p2}, Landroidx/databinding/d;->c(Landroidx/databinding/e;[Landroid/view/View;I)Landroidx/databinding/g;

    move-result-object p0

    return-object p0
.end method

.method private static c(Landroidx/databinding/e;Landroid/view/ViewGroup;II)Landroidx/databinding/g;
    .locals 4

    .prologue
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    sub-int v1, v0, p2

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    sub-int/2addr v0, v2

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p0, p1, p3}, Landroidx/databinding/f;->a(Landroidx/databinding/e;Landroid/view/View;I)Landroidx/databinding/g;

    move-result-object p0

    return-object p0

    :cond_0
    new-array v0, v1, [Landroid/view/View;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    add-int v3, v2, p2

    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    aput-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-static {p0, v0, p3}, Landroidx/databinding/f;->b(Landroidx/databinding/e;[Landroid/view/View;I)Landroidx/databinding/g;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroidx/databinding/g;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, p3, v0}, Landroidx/databinding/f;->e(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLandroidx/databinding/e;)Landroidx/databinding/g;

    move-result-object p0

    return-object p0
.end method

.method public static e(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLandroidx/databinding/e;)Landroidx/databinding/g;
    .locals 2

    .prologue
    const/4 v0, 0x0

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz v1, :cond_2

    invoke-static {p4, p2, v0, p1}, Landroidx/databinding/f;->c(Landroidx/databinding/e;Landroid/view/ViewGroup;II)Landroidx/databinding/g;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-static {p4, p0, p1}, Landroidx/databinding/f;->a(Landroidx/databinding/e;Landroid/view/View;I)Landroidx/databinding/g;

    move-result-object p0

    return-object p0
.end method
