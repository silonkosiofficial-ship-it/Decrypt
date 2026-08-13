.class public final synthetic Lb5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le5/h;


# instance fields
.field public final synthetic a:Le5/F;

.field public final synthetic b:Le5/F;


# direct methods
.method public synthetic constructor <init>(Le5/F;Le5/F;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/a;->a:Le5/F;

    iput-object p2, p0, Lb5/a;->b:Le5/F;

    return-void
.end method


# virtual methods
.method public final a(Le5/e;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lb5/a;->a:Le5/F;

    iget-object v1, p0, Lb5/a;->b:Le5/F;

    invoke-static {v0, v1, p1}, Lcom/google/firebase/appcheck/playintegrity/FirebaseAppCheckPlayIntegrityRegistrar;->a(Le5/F;Le5/F;Le5/e;)Lc5/i;

    move-result-object p1

    return-object p1
.end method
