.class public abstract LG1/c;
.super LG1/a;
.source "SourceFile"


# instance fields
.field private K:I

.field private L:I

.field private M:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Landroid/content/Context;ILandroid/database/Cursor;Z)V
    .locals 0

    invoke-direct {p0, p1, p3, p4}, LG1/a;-><init>(Landroid/content/Context;Landroid/database/Cursor;Z)V

    iput p2, p0, LG1/c;->L:I

    iput p2, p0, LG1/c;->K:I

    const-string p2, "layout_inflater"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/LayoutInflater;

    iput-object p1, p0, LG1/c;->M:Landroid/view/LayoutInflater;

    return-void
.end method


# virtual methods
.method public o(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    iget-object p1, p0, LG1/c;->M:Landroid/view/LayoutInflater;

    iget p2, p0, LG1/c;->L:I

    const/4 v0, 0x0

    invoke-virtual {p1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public r(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    iget-object p1, p0, LG1/c;->M:Landroid/view/LayoutInflater;

    iget p2, p0, LG1/c;->K:I

    const/4 v0, 0x0

    invoke-virtual {p1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
