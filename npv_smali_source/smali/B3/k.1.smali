.class public final synthetic LB3/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field public final synthetic a:LB3/w;


# direct methods
.method public synthetic constructor <init>(LB3/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB3/k;->a:LB3/w;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 1

    iget-object v0, p0, LB3/k;->a:LB3/w;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p1}, LB3/w;->X6(LB3/w;Landroid/net/Uri;)LP4/d;

    move-result-object p1

    return-object p1
.end method
