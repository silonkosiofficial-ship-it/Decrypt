.class final LU0/j;
.super Landroid/text/style/ClickableSpan;
.source "SourceFile"


# instance fields
.field private final a:LM0/h;


# direct methods
.method public constructor <init>(LM0/h;)V
    .locals 0

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    iput-object p1, p0, LU0/j;->a:LM0/h;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, LU0/j;->a:LM0/h;

    invoke-virtual {p1}, LM0/h;->a()LM0/i;

    return-void
.end method
