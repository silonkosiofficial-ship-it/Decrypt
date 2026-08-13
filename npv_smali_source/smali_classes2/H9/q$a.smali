.class public final LH9/q$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH9/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH9/q$a$a;
    }
.end annotation


# static fields
.field static final synthetic a:LH9/q$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LH9/q$a;

    invoke-direct {v0}, LH9/q$a;-><init>()V

    sput-object v0, LH9/q$a;->a:LH9/q$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
