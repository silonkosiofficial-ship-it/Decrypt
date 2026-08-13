.class public Lp8/v;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field private final C:Ljava/util/List;


# direct methods
.method public constructor <init>(Lp8/p;)V
    .locals 0

    const-string p1, "Message was missing required fields.  (Lite runtime could not determine which fields were missing)."

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lp8/v;->C:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Lp8/k;
    .locals 2

    new-instance v0, Lp8/k;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lp8/k;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
