.class public final synthetic LW4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le5/h;


# instance fields
.field public final synthetic a:Le5/F;

.field public final synthetic b:Le5/F;

.field public final synthetic c:Le5/F;


# direct methods
.method public synthetic constructor <init>(Le5/F;Le5/F;Le5/F;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW4/a;->a:Le5/F;

    iput-object p2, p0, LW4/a;->b:Le5/F;

    iput-object p3, p0, LW4/a;->c:Le5/F;

    return-void
.end method


# virtual methods
.method public final a(Le5/e;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LW4/a;->a:Le5/F;

    iget-object v1, p0, LW4/a;->b:Le5/F;

    iget-object v2, p0, LW4/a;->c:Le5/F;

    invoke-static {v0, v1, v2, p1}, Lcom/google/firebase/appcheck/debug/FirebaseAppCheckDebugRegistrar;->a(Le5/F;Le5/F;Le5/F;Le5/e;)LX4/e;

    move-result-object p1

    return-object p1
.end method
