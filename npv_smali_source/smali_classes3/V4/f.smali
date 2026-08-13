.class public final synthetic LV4/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le5/h;


# instance fields
.field public final synthetic a:Le5/F;

.field public final synthetic b:Le5/F;

.field public final synthetic c:Le5/F;

.field public final synthetic d:Le5/F;


# direct methods
.method public synthetic constructor <init>(Le5/F;Le5/F;Le5/F;Le5/F;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV4/f;->a:Le5/F;

    iput-object p2, p0, LV4/f;->b:Le5/F;

    iput-object p3, p0, LV4/f;->c:Le5/F;

    iput-object p4, p0, LV4/f;->d:Le5/F;

    return-void
.end method


# virtual methods
.method public final a(Le5/e;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LV4/f;->a:Le5/F;

    iget-object v1, p0, LV4/f;->b:Le5/F;

    iget-object v2, p0, LV4/f;->c:Le5/F;

    iget-object v3, p0, LV4/f;->d:Le5/F;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/google/firebase/appcheck/FirebaseAppCheckRegistrar;->a(Le5/F;Le5/F;Le5/F;Le5/F;Le5/e;)LV4/e;

    move-result-object p1

    return-object p1
.end method
