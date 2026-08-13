.class public final Le1/d$c;
.super Le1/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field final synthetic i:Le1/d;


# direct methods
.method public constructor <init>(Le1/d;Le1/c;)V
    .locals 1

    const-string v0, "cache"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Le1/d$c;->i:Le1/d;

    invoke-direct {p0}, Le1/b;-><init>()V

    new-instance p1, Le1/j;

    invoke-direct {p1, p0, p2}, Le1/j;-><init>(Le1/b;Le1/c;)V

    invoke-virtual {p0, p1}, Le1/b;->H(Le1/b$a;)V

    return-void
.end method
