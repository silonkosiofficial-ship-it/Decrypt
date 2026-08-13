.class public final LH9/C$a$a;
.super LH9/C;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH9/C$a;->a(LX9/f;LH9/w;J)LH9/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic D:LH9/w;

.field final synthetic E:J

.field final synthetic F:LX9/f;


# direct methods
.method constructor <init>(LH9/w;JLX9/f;)V
    .locals 0

    iput-object p1, p0, LH9/C$a$a;->D:LH9/w;

    iput-wide p2, p0, LH9/C$a$a;->E:J

    iput-object p4, p0, LH9/C$a$a;->F:LX9/f;

    invoke-direct {p0}, LH9/C;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, LH9/C$a$a;->E:J

    return-wide v0
.end method

.method public f()LH9/w;
    .locals 1

    iget-object v0, p0, LH9/C$a$a;->D:LH9/w;

    return-object v0
.end method

.method public g()LX9/f;
    .locals 1

    iget-object v0, p0, LH9/C$a$a;->F:LX9/f;

    return-object v0
.end method
