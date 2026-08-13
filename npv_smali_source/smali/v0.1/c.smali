.class public final Lv0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv0/a;


# instance fields
.field private final a:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv0/c;->a:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    .prologue
    sget-object v0, Lv0/b;->a:Lv0/b$a;

    invoke-virtual {v0}, Lv0/b$a;->a()I

    move-result v1

    invoke-static {p1, v1}, Lv0/b;->b(II)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lv0/c;->a:Landroid/view/View;

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->performHapticFeedback(I)Z

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Lv0/b$a;->b()I

    move-result v0

    invoke-static {p1, v0}, Lv0/b;->b(II)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lv0/c;->a:Landroid/view/View;

    const/16 v0, 0x9

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method
