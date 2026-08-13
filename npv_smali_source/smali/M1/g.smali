.class public abstract LM1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM1/g$a;
    }
.end annotation


# static fields
.field public static final a:LM1/g$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LM1/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LM1/g$a;-><init>(Ly7/k;)V

    sput-object v0, LM1/g;->a:LM1/g$a;

    return-void
.end method
