.class final LN/q$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN/q$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LN/q$a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN/q$a$b;

    invoke-direct {v0}, LN/q$a$b;-><init>()V

    sput-object v0, LN/q$a$b;->a:LN/q$a$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LN/j;I)J
    .locals 0

    invoke-virtual {p1}, LN/j;->k()LM0/K;

    move-result-object p1

    invoke-virtual {p1, p2}, LM0/K;->C(I)J

    move-result-wide p1

    return-wide p1
.end method
