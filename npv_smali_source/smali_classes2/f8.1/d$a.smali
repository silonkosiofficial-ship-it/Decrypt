.class final Lf8/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf8/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:LF8/E;

.field private final b:I


# direct methods
.method public constructor <init>(LF8/E;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf8/d$a;->a:LF8/E;

    iput p2, p0, Lf8/d$a;->b:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lf8/d$a;->b:I

    return v0
.end method

.method public final b()LF8/E;
    .locals 1

    iget-object v0, p0, Lf8/d$a;->a:LF8/E;

    return-object v0
.end method
