.class public final synthetic Lg5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li5/a;


# instance fields
.field public final synthetic a:Lg5/d;


# direct methods
.method public synthetic constructor <init>(Lg5/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg5/b;->a:Lg5/d;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lg5/b;->a:Lg5/d;

    invoke-static {v0, p1, p2}, Lg5/d;->b(Lg5/d;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
