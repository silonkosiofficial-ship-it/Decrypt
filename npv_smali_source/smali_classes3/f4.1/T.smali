.class public final synthetic Lf4/T;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lf4/X;

.field public final synthetic D:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lf4/X;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/T;->C:Lf4/X;

    iput-object p2, p0, Lf4/T;->D:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lf4/T;->C:Lf4/X;

    iget-object v1, p0, Lf4/T;->D:Ljava/lang/String;

    invoke-static {v0, v1}, Lf4/w0;->a(Landroid/webkit/WebView;Ljava/lang/String;)V

    return-void
.end method
