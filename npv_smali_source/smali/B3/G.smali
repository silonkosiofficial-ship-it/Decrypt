.class public final LB3/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:LB3/B;


# direct methods
.method public constructor <init>(LB3/B;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB3/G;->a:LB3/B;

    return-void
.end method


# virtual methods
.method public final synthetic b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LB3/G;->a:LB3/B;

    invoke-virtual {v0}, LB3/B;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
