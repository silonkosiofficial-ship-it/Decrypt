.class final LV/E1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/b;
.implements Ljava/lang/Iterable;
.implements Lz7/a;


# instance fields
.field private final C:LV/h1;

.field private final D:I

.field private final E:LV/W;

.field private final F:LV/D1;

.field private final G:Ljava/lang/Object;

.field private final H:Ljava/lang/Iterable;


# direct methods
.method public constructor <init>(LV/h1;ILV/W;LV/D1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV/E1;->C:LV/h1;

    iput p2, p0, LV/E1;->D:I

    iput-object p4, p0, LV/E1;->F:LV/D1;

    invoke-virtual {p3}, LV/W;->c()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LV/E1;->G:Ljava/lang/Object;

    iput-object p0, p0, LV/E1;->H:Ljava/lang/Iterable;

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 5

    new-instance v0, LV/C1;

    iget-object v1, p0, LV/E1;->C:LV/h1;

    iget v2, p0, LV/E1;->D:I

    iget-object v3, p0, LV/E1;->E:LV/W;

    iget-object v4, p0, LV/E1;->F:LV/D1;

    invoke-direct {v0, v1, v2, v3, v4}, LV/C1;-><init>(LV/h1;ILV/W;LV/D1;)V

    return-object v0
.end method
