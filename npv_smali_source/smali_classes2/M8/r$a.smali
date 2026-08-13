.class public final LM8/r$a;
.super LM8/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM8/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final d:LM8/r$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/r$a;

    invoke-direct {v0}, LM8/r$a;-><init>()V

    sput-object v0, LM8/r$a;->d:LM8/r$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    sget-object v0, LM8/r$a$a;->D:LM8/r$a$a;

    const/4 v1, 0x0

    const-string v2, "Boolean"

    invoke-direct {p0, v2, v0, v1}, LM8/r;-><init>(Ljava/lang/String;Lx7/l;Ly7/k;)V

    return-void
.end method
