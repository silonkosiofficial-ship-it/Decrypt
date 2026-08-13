.class LN4/o$b;
.super LN4/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN4/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private final E:LN4/o;


# direct methods
.method constructor <init>(LN4/o;I)V
    .locals 1

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, LN4/a;-><init>(II)V

    iput-object p1, p0, LN4/o$b;->E:LN4/o;

    return-void
.end method


# virtual methods
.method protected b(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LN4/o$b;->E:LN4/o;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
