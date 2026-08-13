.class public final LG8/f$a;
.super LG8/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LG8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LG8/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LG8/f$a;

    invoke-direct {v0}, LG8/f$a;-><init>()V

    sput-object v0, LG8/f$a;->a:LG8/f$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LG8/f;-><init>()V

    return-void
.end method
