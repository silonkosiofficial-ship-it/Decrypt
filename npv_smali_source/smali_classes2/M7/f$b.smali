.class public final LM7/f$b;
.super LM7/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM7/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final e:LM7/f$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM7/f$b;

    invoke-direct {v0}, LM7/f$b;-><init>()V

    sput-object v0, LM7/f$b;->e:LM7/f$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    sget-object v0, LL7/j;->v:Ln8/c;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v3, "KFunction"

    invoke-direct {p0, v0, v3, v1, v2}, LM7/f;-><init>(Ln8/c;Ljava/lang/String;ZLn8/b;)V

    return-void
.end method
