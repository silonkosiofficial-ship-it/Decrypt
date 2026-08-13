.class public final synthetic LB3/W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:LB3/Y;

.field public final synthetic D:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LB3/Y;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB3/W;->C:LB3/Y;

    iput-object p2, p0, LB3/W;->D:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LB3/W;->C:LB3/Y;

    iget-object v0, v0, LB3/Y;->b:LB3/a;

    invoke-static {v0}, LB3/a;->a(LB3/a;)Landroid/webkit/WebView;

    move-result-object v0

    iget-object v1, p0, LB3/W;->D:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    return-void
.end method
