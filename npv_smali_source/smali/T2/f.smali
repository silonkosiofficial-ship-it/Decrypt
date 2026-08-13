.class public final LT2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT2/f$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method synthetic constructor <init>(LT2/f$a;LT2/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LT2/f$a;->c(LT2/f$a;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LT2/f;->a:Ljava/lang/String;

    return-void
.end method

.method public static a()LT2/f$a;
    .locals 2

    new-instance v0, LT2/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LT2/f$a;-><init>(LT2/x;)V

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LT2/f;->a:Ljava/lang/String;

    return-object v0
.end method
