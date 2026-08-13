.class public final synthetic LN5/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le5/h;


# instance fields
.field public final synthetic a:Le5/F;


# direct methods
.method public synthetic constructor <init>(Le5/F;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN5/q;->a:Le5/F;

    return-void
.end method


# virtual methods
.method public final a(Le5/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LN5/q;->a:Le5/F;

    invoke-static {v0, p1}, Lcom/google/firebase/remoteconfig/RemoteConfigRegistrar;->a(Le5/F;Le5/e;)Lcom/google/firebase/remoteconfig/c;

    move-result-object p1

    return-object p1
.end method
