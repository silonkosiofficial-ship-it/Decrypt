.class final LZ8/D$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW8/f0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZ8/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field public final C:LZ8/D;

.field public D:J

.field public final E:Ljava/lang/Object;

.field public final F:Lm7/e;


# direct methods
.method public constructor <init>(LZ8/D;JLjava/lang/Object;Lm7/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ8/D$a;->C:LZ8/D;

    iput-wide p2, p0, LZ8/D$a;->D:J

    iput-object p4, p0, LZ8/D$a;->E:Ljava/lang/Object;

    iput-object p5, p0, LZ8/D$a;->F:Lm7/e;

    return-void
.end method


# virtual methods
.method public e()V
    .locals 1

    iget-object v0, p0, LZ8/D$a;->C:LZ8/D;

    invoke-static {v0, p0}, LZ8/D;->q(LZ8/D;LZ8/D$a;)V

    return-void
.end method
