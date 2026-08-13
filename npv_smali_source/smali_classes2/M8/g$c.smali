.class public final LM8/g$c;
.super LM8/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM8/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final b:LM8/g$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/g$c;

    invoke-direct {v0}, LM8/g$c;-><init>()V

    sput-object v0, LM8/g$c;->b:LM8/g$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, LM8/g;-><init>(ZLy7/k;)V

    return-void
.end method
