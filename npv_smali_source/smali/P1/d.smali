.class public abstract LP1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP1/d$a;
    }
.end annotation


# static fields
.field public static final a:LP1/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LP1/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LP1/d$a;-><init>(Ly7/k;)V

    sput-object v0, LP1/d;->a:LP1/d$a;

    return-void
.end method
